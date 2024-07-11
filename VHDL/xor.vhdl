-- entitty declaration
entity xor_gate is
    port (
        a, b: in std_logic;
        y: out std_logic
    );
end entity xor_gate;

--arch def
architecture behavioral of xor_gate is 
begin   
    process (a, b)
    begin
        y <= a xor b;
    end process;
    end architecture behvioral;