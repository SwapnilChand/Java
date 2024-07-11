-- Entity declaration
entity xnor_gate is
    port (
      a, b: in std_logic;  -- input signals
      y: out std_logic     
    );
  end entity xnor_gate;

  architecture behavioral of xnor_gate is
  begin
    process (a, b)  
    begin
      y <= not (a xor b);  
    end process;
  end architecture behavioral;
  