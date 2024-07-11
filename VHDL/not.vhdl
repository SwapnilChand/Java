-- entitty declaration
entity not_gate is
    port (
        a: in std_logic;
        y: out std_logic
    );
end entity not_gate;

--arch def
architecture behavioral of not_gate is 
begin   
    process (a)
    begin
        y <= not a;
    end process;
    end architecture behvioral;